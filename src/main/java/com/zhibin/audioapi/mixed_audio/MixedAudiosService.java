package com.zhibin.audioapi.mixed_audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class MixedAudiosService {

    private final MixedAudiosRepository mixedAudiosRepository;

    @Autowired
    public MixedAudiosService(MixedAudiosRepository mixedAudiosRepository){

        this.mixedAudiosRepository = mixedAudiosRepository;
    }

    public List<MixedAudios> getMixedAudios(){
        return mixedAudiosRepository.findAll();
    }
}
