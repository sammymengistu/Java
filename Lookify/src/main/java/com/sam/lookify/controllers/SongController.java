package com.sam.lookify.controllers;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sam.lookify.models.Song;
import com.sam.lookify.services.SongService;

@Controller
@RequestMapping("/")
public class SongController {
	private final  SongService songService;
	
	public SongController(SongService songService){
		this.songService = songService;
	}
	@RequestMapping("")
	public String index(){
		return "index.jsp";
	}

	@RequestMapping("dashboard")
	public String dashboard(Model model){
		model.addAttribute("songs",songService.all());
		return "dashboard.jsp";
	}
	
	@RequestMapping("songs/{id}")
	public String songs(@PathVariable("id") long id,Model model){
		model.addAttribute("song",songService.findById(id));
		return "song.jsp";
	}
	
	@RequestMapping("songs/new")
	public String newSong(Model model){
		model.addAttribute("song",new Song());
		return "new.jsp";
	}
	
	@PostMapping("songs/new")
	public String create(@Valid @ModelAttribute("song") Song song,BindingResult res,RedirectAttributes flash){
		if(res.hasErrors()){
			flash.addFlashAttribute("errs",res.getAllErrors());
			return "redirect:/songs/new";
		}else{
			songService.create(song);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("songs/delete/{id}")
	public String destroy(@PathVariable("id") long id){
		songService.destroy(id);
		return "redirect:/dashboard";
	}
		
	@PostMapping("/search")
	public String search(@RequestParam(value="artist") String artist,Model model){
		model.addAttribute("songs",songService.findByArtist(artist));
		return "search.jsp";
	}
	
	@RequestMapping("/songs/top10")
	public String top10(Model model){
		model.addAttribute("songs",songService.top10());
		return "top10.jsp";
	}

}
