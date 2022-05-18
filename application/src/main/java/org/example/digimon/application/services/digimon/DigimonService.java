package org.example.digimon.application.services.digimon;

import lombok.NonNull;
import org.example.digimon.application.ports.in.digimon.RemoveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SaveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SearchDigimonUseCase;
import org.example.digimon.application.ports.out.digimon.RemoveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SaveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SearchDigimonPort;
import org.example.digimon.domain.digimon.Digimon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DigimonService implements RemoveDigimonUseCase, SaveDigimonUseCase, SearchDigimonUseCase {

    private final RemoveDigimonPort removeDigimonPort;
    private final SaveDigimonPort saveDigimonPort;
    private final SearchDigimonPort searchDigimonPort;

    @Autowired
    public DigimonService(RemoveDigimonPort removeDigimonPort, SaveDigimonPort saveDigimonPort, SearchDigimonPort searchDigimonPort) {
        this.removeDigimonPort = removeDigimonPort;
        this.saveDigimonPort = saveDigimonPort;
        this.searchDigimonPort = searchDigimonPort;
    }


    @Override
    public void remove(@NonNull final Long id) {
        removeDigimonPort.remove(id);
    }

    @Override
    public Digimon save(@NonNull final Digimon digimon) {
        return saveDigimonPort.save(digimon);
    }

    @Override
    public Digimon findById(@NonNull final Long id) {
        return searchDigimonPort.findById(id);
    }

    @Override
    public List<Digimon> findAll() {
        return searchDigimonPort.findAll();
    }
}
