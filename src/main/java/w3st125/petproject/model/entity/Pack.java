package w3st125.petproject.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PACK")
@NoArgsConstructor
@Getter
@Setter
public class Pack {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String packName;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "packId")
  private List<Word> words;
}
