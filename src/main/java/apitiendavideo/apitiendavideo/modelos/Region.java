package apitiendavideo.apitiendavideo.modelos;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_region")
    @GenericGenerator(name = "secuencia_region", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "region", length = 100)
    private String region;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Pais pais;

    @Column(name = "codigo", length = 5)
    private String codigo;

    public Region() {
    }

    public Region(long id, String region, Pais pais, String codigo) {
        this.id = id;
        this.region = region;
        this.pais = pais;
        this.codigo = codigo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
