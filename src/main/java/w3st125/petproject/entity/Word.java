package w3st125.petproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "WORD")
@NoArgsConstructor
@Getter
@Setter
public class Word {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long wordId;

  private String word;

  private Long packId;
}
