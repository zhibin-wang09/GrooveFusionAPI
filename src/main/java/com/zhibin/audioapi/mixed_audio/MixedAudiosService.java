package com.zhibin.audioapi.mixed_audio;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class MixedAudiosService {

    public List<MixedAudios> getMixedAudios(){
        return List.of(new MixedAudios(0, "Zhi Bin", LocalDate.now(), null));
    }
}
