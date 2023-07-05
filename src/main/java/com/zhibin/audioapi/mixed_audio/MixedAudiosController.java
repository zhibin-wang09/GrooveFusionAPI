package com.zhibin.audioapi.mixed_audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping(path ="/api/v1/mixed_audios") /* set up base endpoint. Any other
                                                endpoint inside this class is relative
                                                to this endpoint */
public class MixedAudiosController {

    private final MixedAudiosService service;
    @Autowired
    public MixedAudiosController(MixedAudiosService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<MixedAudios> getMixedAudios(){
        return service.getMixedAudios();
    }

    @PostMapping
    public ResponseEntity uploadProduction(@RequestBody MixedAudios audios){
        audios.setDate(LocalDate.now());
        service.addNewMixedAudio(audios);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{audioId}")
    public void deleteProduction(@PathVariable("audioId") Long id){
        Optional<MixedAudios> audio = service.findAudioById(id);
        if(audio.isEmpty()) throw new NoSuchElementException();
        service.deleteMixedAudio(id);
    }
}
