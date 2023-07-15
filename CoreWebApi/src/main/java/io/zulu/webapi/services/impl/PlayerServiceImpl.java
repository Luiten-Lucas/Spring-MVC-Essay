package io.zulu.webapi.services.impl;

import io.zulu.webapi.entities.PlayerEntity;
import io.zulu.webapi.models.Player;
import io.zulu.webapi.repositories.jpa.PlayerJpaRepository;
import io.zulu.webapi.services.PlayerService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerJpaRepository playerJpaRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public Player getPlayerById(Long id) {
        PlayerEntity playerEntityAux =  playerJpaRepository.getReferenceById(id);
        if(Objects.isNull(playerEntityAux.getUserName())){
            throw new EntityNotFoundException();
        } else {
            String playerName = playerEntityAux.getUserName();
            return modelMapper.map(playerEntityAux,Player.class);
        }
    }
}
