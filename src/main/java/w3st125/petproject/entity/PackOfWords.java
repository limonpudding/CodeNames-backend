package w3st125.petproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PACK_OF_WORDS")
@NoArgsConstructor
@Getter
@Setter
public class PackOfWords {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long packId;

  private String packName;
}
