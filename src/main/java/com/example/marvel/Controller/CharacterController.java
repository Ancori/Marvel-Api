package com.example.marvel.Controller;

import java.util.List;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.marvel.Domains.Characters;
import com.example.marvel.services.CharactersService;

@RestController
public class CharacterController {

    @Autowired
    private CharactersService charactersService = new CharactersService();

    //Insertar datos de la api enviados desde el front
    @PostMapping(value = "/savecharacter", consumes = "application/json", produces = "application/json")
    public String save(@RequestBody String data) {
        try {
            charactersService.removeAll();
             JSONArray arregloJson = new JSONArray(data);
            for (int i = 0; i < arregloJson.length(); i++) {
            Characters character = new Characters();
            character.setId(arregloJson.getJSONObject(i).getString("id"));
            character.setName(arregloJson.getJSONObject(i).getString("name"));
            charactersService.save(character);
        }
            
        } catch (Exception e) {
           System.out.println(e);
        }

        return "Lista actualizada con exito";
    }

    //Obtener la lista de personajes
    @GetMapping("/getListCharacter")
    public List<Characters> findAll(Model model) {
        return charactersService.findAll();
    }

    //Obtener el personaje dado por su id
    @GetMapping("/getCharacter/{id}")
    public Characters findById(@PathVariable String id) {
        return charactersService.findById(id).get();
    }

    //Eliminar todos los personajes
    @DeleteMapping("/deleteaAllCharacters")
    public void deleteAll() {
        charactersService.removeAll();
    }
}
