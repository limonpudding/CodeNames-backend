package w3st125.petproject.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import w3st125.petproject.entity.Pack;
import w3st125.petproject.repository.PackRepository;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/pack")
public class PackController {
  private final PackRepository packRepository;

  @PostMapping
  public ResponseEntity<Pack> addToTable(@RequestBody Pack pack) {
    return ResponseEntity.ok(packRepository.save(pack));
  }

  @GetMapping("/find")
  public ResponseEntity<Pack> findById(@PathVariable Long packId) {
    return ResponseEntity.ok(packRepository.findById(packId).orElse(null));
  }

  @DeleteMapping("/delete")
  public HttpStatus delete(@PathVariable Long packId) {
    packRepository.deleteById(packId);
    return HttpStatus.OK;
  }
}

//todo DTO