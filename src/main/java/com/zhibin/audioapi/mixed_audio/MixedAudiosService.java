package com.zhibin.audioapi.mixed_audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<MixedAudios> findAudioById(Long id){
        return mixedAudiosRepository.findById(id);
    }

    public void addNewMixedAudio(MixedAudios audios){
        mixedAudiosRepository.save(audios);
    }

    public void deleteMixedAudio(Long id){
        mixedAudiosRepository.deleteById(id);
    }
}
