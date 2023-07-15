package io.zulu.webapi.services;

import io.zulu.webapi.models.Player;
import org.springframework.stereotype.Service;

@Service
public interface PlayerService {

    Player getPlayerById(Long id);
}
