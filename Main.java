enum Vestuario {
    BLUSA("blusa", "rosada", 11){
        @Override
        public String DescripcionPrenda() {
            return "la blusa que disponemos es rosada";
        }
    },
    JEAN("pantalon", "largo", 6){
        @Override
        public String DescripcionPrenda() {
            return "el mejor jean del mercado";
        }
    },
    CAMISETA("camiseta", "azul", 15){
        @Override
        public String DescripcionPrenda() {
            return "la camiseta existente es azul";
        }
    },
    CAMISA("camisa", "botones", 16){
        @Override
        public String DescripcionPrenda() {
            return "la camisa dispone de botones";
        }
    };
    private String nombre;
    private String descripcion;
    private int numeroest;


    Vestuario(String nombre, String descripcion, int numeroest) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroest = numeroest;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroest() {
        return numeroest;
    }

    public void setNumeroest(int numeroest) {
        this.numeroest = numeroest;
    }
    public abstract String DescripcionPrenda();

}



