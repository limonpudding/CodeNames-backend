package w3st125.petproject.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import w3st125.petproject.model.dto.PackDto;
import w3st125.petproject.model.entity.Pack;
import w3st125.petproject.model.mapper.PackMapper;
import w3st125.petproject.repository.PackRepository;
import w3st125.petproject.service.PackService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/pack")
public class PackController {
  private final PackRepository packRepository; // TODO заменить на PackService
  private final PackService packService;
  private final PackMapper packMapper;
  // TODO заменить все входящие и исходящие данные на DTO
  @GetMapping("/{id}")
  public ResponseEntity<Pack> getById(@PathVariable Long id) {
    return ResponseEntity.ok(packRepository.findById(id).orElse(null));
  }

  @PostMapping
  public ResponseEntity<PackDto> create(@RequestBody PackDto packDto) {
    Pack pack = packMapper.fromDto(packDto);
    return ResponseEntity.ok(packMapper.toDto(packRepository.save(pack)));
  }

  @PutMapping
  public ResponseEntity<Pack> update(@RequestBody Pack pack) {
    // TODO сделать метод обновления в БД
    return ResponseEntity.ok(packRepository.save(pack));
  }

  @DeleteMapping("/delete")
  public HttpStatus delete(@PathVariable Long packId) {
    packRepository.deleteById(packId);
    return HttpStatus.OK;
  }

  // TODO добавить метод для импорта пака слов через файл
}