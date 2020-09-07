package br.com.bandtec.avalicaocontinuada1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogosController {

    private List<Jogos> joguinho = new ArrayList<>();

    @GetMapping
    public ResponseEntity getJoguinho() {
        if(joguinho.isEmpty()){
            return ResponseEntity.status(204).build();
        }else {
            return ResponseEntity.status(200).body(joguinho);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity getJoguinho(@PathVariable Integer id) {
        if(joguinho.size() >= id ){
            return ResponseEntity.status(200).body(joguinho.get(id -1));
        }else {
            return ResponseEntity.status(404).build();
        }

    }

    @PostMapping("/ps4")
    public ResponseEntity comprarJogo(@RequestBody JogoPs4 jogops4){
        joguinho.add(jogops4);
        return ResponseEntity.status(201).build();
    }
    @PostMapping("/xbox")
    public ResponseEntity comprarJogo(@RequestBody JogoXbox jogoXbox){
        joguinho.add(jogoXbox);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteJoguinho(@PathVariable Integer id) {
        if (joguinho.size() >= id) {
            joguinho.remove(id -1);
            return ResponseEntity.status(200).build();
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
