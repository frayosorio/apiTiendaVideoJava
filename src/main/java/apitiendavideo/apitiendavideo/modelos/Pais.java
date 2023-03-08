package apitiendavideo.apitiendavideo.modelos;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @GenericGenerator(name = "secuencia_pais", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "pais", length = 100, unique = true)
    private String pais;

    @Column(name = "codigoalfa2", length = 5, nullable = true)
    private String codigoAlfa2;

    @Column(name = "codigoalfa3", length = 5, nullable = true)
    private String codigoAlfa3;

    public Pais() {
    }

    public Pais(long id, String pais, String codigoAlfa2, String codigoAlfa3) {
        this.id = id;
        this.pais = pais;
        this.codigoAlfa2 = codigoAlfa2;
        this.codigoAlfa3 = codigoAlfa3;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoAlfa2() {
        return codigoAlfa2;
    }

    public void setCodigoAlfa2(String codigoAlfa2) {
        this.codigoAlfa2 = codigoAlfa2;
    }

    public void setCodigoAlfa3(String codigoAlfa3) {
        this.codigoAlfa3 = codigoAlfa3;
    }

    public String getCodigoAlfa3() {
        return codigoAlfa3;
    }

}
