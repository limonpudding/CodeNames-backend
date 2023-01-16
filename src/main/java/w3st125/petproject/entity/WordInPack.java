package w3st125.petproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "WORDS_IN_PACK")
@NoArgsConstructor
@Getter
@Setter
public class WordInPack {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long wordId;

  private String word;

  private Long packId;
}
