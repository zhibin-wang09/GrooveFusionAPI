package com.zhibin.audioapi.mixed_audio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MixedAudiosRepository extends JpaRepository<MixedAudios,Long> {

}
