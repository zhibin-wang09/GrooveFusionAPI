package com.zhibin.audioapi.mixed_audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mixed_audios") /* set up endpoint */
public class MixedAudiosController {

    private final MixedAudiosService service;
    @Autowired
    public MixedAudiosController(MixedAudiosService service) {
        this.service = service;
    }

    public List<MixedAudios> getMixedAudios(){
        return service.getMixedAudios();
    }
}
