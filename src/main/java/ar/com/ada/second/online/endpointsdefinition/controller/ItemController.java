package ar.com.ada.second.online.endpointsdefinition.controller;

import ar.com.ada.second.online.endpointsdefinition.model.dto.ItemDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

@RestController
@RequestMapping(value = "/items")
public class ItemController {

    @GetMapping({"/", ""})
    public ResponseEntity getItemsMethod() {
        List<ItemDTO> items = Arrays.asList(
                new ItemDTO(1L, "CocaCola", "Gaseosa", 123456),
                new ItemDTO(2L, "Palitos Salados", "Snack", 123457),
                new ItemDTO(3L, "Cerveza Heiniken", "Bebida Rica", 123458)
        );

        return ResponseEntity.ok().body(items);
    }

    @PostMapping({"/", ""})
    public ResponseEntity postItemMethod(@Valid @RequestBody ItemDTO item) throws URISyntaxException {
        Long id = Math.abs(new Random().nextLong()) % 100;
        item.setId(id);
        URI uri = new URI("/items/" + id);
        return ResponseEntity.created(uri).body(item);
    }
}
