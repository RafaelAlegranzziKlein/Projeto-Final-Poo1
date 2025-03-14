
package br.ulbra.entity;

/**
 *
 * @author Rafael Klein
 */
public class Pet {
    private int idUso;
    private String nomePet;
    private String racaPet;
    private String sexoPet;
    private String corPeloPet;
    private int anoNascimentoPet;

    @Override
    public String toString() {
        return    "ID do Pet                :" + idUso
                + "Nome do Pet              :" + nomePet 
                + "Raça do Pet              :" + racaPet 
                + "Sexo do Pet              :" + sexoPet 
                + "Cor do pelo do Pet       :" + corPeloPet 
                + "Ano de nascimento do Pet :" + anoNascimentoPet;
    }

    public Pet() {
    }

    public Pet(int idUso,String nomePet, String racaPet, String sexoPet, String corPeloPet, int anoNascimentoPet) {
        this.idUso = idUso;
        this.nomePet = nomePet;
        this.racaPet = racaPet;
        this.sexoPet = sexoPet;
        this.corPeloPet = corPeloPet;
        this.anoNascimentoPet = anoNascimentoPet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getRacaPet() {
        return racaPet;
    }

    public void setRacaPet(String racaPet) {
        this.racaPet = racaPet;
    }

    public String getSexoPet() {
        return sexoPet;
    }

    public void setSexoPet(String sexoPet) {
        this.sexoPet = sexoPet;
    }

    public String getCorPeloPet() {
        return corPeloPet;
    }

    public void setCorPeloPet(String corPeloPet) {
        this.corPeloPet = corPeloPet;
    }

    public int getAnoNascimentoPet() {
        return anoNascimentoPet;
    }

    public void setAnoNascimentoPet(int anoNascimentoPet) {
        this.anoNascimentoPet = anoNascimentoPet;
    }
    
    
}
