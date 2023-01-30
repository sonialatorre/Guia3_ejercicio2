public class Listado {

    private int contacto;

    public Listado () {
    }
    public Listado(int contacto) {
        this.contacto = contacto;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Listado{" +
                "contacto=" + contacto +
                '}';
    }
}

