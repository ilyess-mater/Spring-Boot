package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;
import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @GetMapping
    public List<Client> retrieveAllClients() {
        return clientService.retrieveAllClients();
    }

    @PostMapping
    public Client addClient(@RequestBody Client c) {
        return clientService.addClient(c);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client c) {
        return clientService.updateClient(c);
    }

    @GetMapping("/{id}")
    public Client retrieveClient(@PathVariable Long id) {
        return clientService.retrieveClient(id);
    }

    @DeleteMapping("/{id}")
    public void removeClient(@PathVariable Long id) {
        clientService.removeClient(id);
    }
}
