package com.zhibin.audioapi.mixed_audio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/mixed_audios") /* set up endpoint */
public class MixedAudiosController {

    public List<MixedAudios> getMixedAudios(){
        return List.of(new MixedAudios(0, "Zhi Bin", LocalDate.now(), null));
    }
}
