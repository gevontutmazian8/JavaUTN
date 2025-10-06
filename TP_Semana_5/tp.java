/* =========================================================
 * TP5 - Relaciones UML 1 a 1 (Implementaciones mínimas)
 * Autor: Gevont Utmazian
 * ========================================================= */

/* ========== 1. Pasaporte -- Foto -- Titular ========== */
class Foto {
    private String imagen, formato;
    public Foto(String imagen, String formato) { this.imagen = imagen; this.formato = formato; }
}
class Titular {
    private String nombre, dni;
    private Pasaporte pasaporte; // lado bidireccional
    public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setPasaporte(Pasaporte p){ this.pasaporte = p; }
}
class Pasaporte {
    private String numero, fechaEmision;
    private Foto foto;        // composición
    private Titular titular;  // asociación bidireccional
    public Pasaporte(String numero, String fechaEmision, Titular titular, Foto foto){
        this.numero = numero; this.fechaEmision = fechaEmision;
        this.foto = foto; this.titular = titular; titular.setPasaporte(this);
    }
}

/* ========== 2. Celular -- Batería -- Usuario (agregación + asociación) ========== */
class Bateria { String modelo; int capacidad; }
class UsuarioCel {
    String nombre, dni; private Celular celular;
    public void setCelular(Celular c){ this.celular = c; }
}
class Celular {
    String imei, marca, modelo; private Bateria bateria; private UsuarioCel usuario;
    public Celular(String imei, String marca, String modelo, Bateria b, UsuarioCel u){
        this.imei=imei; this.marca=marca; this.modelo=modelo; this.bateria=b; this.usuario=u; u.setCelular(this);
    }
}

/* ========== 3. Libro -- Autor -- Editorial (asociación + agregación) ========== */
class Autor { String nombre, nacionalidad; }
class Editorial { String nombre, direccion; }
class LibroUML {
    String titulo, isbn; private Autor autor; private Editorial editorial;
    public LibroUML(String t, String i, Autor a, Editorial e){ titulo=t; isbn=i; autor=a; editorial=e; }
}

/* ========== 4. TarjetaDeCredito -- Cliente -- Banco (asoc. bidi + agregación) ========== */
class Cliente {
    String nombre, dni; private TarjetaDeCredito tarjeta;
    public void setTarjeta(TarjetaDeCredito t){ this.tarjeta=t; }
}
class Banco { String nombre, cuit; }
class TarjetaDeCredito {
    String numero, fechaVencimiento; private Cliente cliente; private Banco banco;
    public TarjetaDeCredito(String n, String fv, Cliente c, Banco b){
        numero=n; fechaVencimiento=fv; cliente=c; banco=b; c.setTarjeta(this);
    }
}

/* ========== 5. Computadora -- PlacaMadre -- Propietario (composición + asoc. bidi) ========== */
class PlacaMadre { String modelo, chipset; }
class Propietario { String nombre, dni; private Computadora pc;
    public void setPc(Computadora c){ this.pc=c; }
}
class Computadora {
    String marca, numeroSerie; private PlacaMadre placa; private Propietario propietario;
    public Computadora(String m, String ns, PlacaMadre p, Propietario pr){
        marca=m; numeroSerie=ns; placa=p; propietario=pr; pr.setPc(this);
    }
}

/* ========== 6. Reserva -- ClienteR -- Mesa (asoc. uni + agregación) ========== */
class ClienteR { String nombre, telefono; }
class Mesa { int numero, capacidad; }
class Reserva {
    String fecha, hora; private ClienteR cliente; private Mesa mesa;
    public Reserva(String f, String h, ClienteR c, Mesa m){ fecha=f; hora=h; cliente=c; mesa=m; }
}

/* ========== 7. Vehiculo -- Motor -- Conductor (agregación + asoc. bidi) ========== */
class Motor { String tipo, numeroSerie; }
class Conductor {
    String nombre, licencia; private Vehiculo vehiculo;
    public void setVehiculo(Vehiculo v){ this.vehiculo=v; }
}
class Vehiculo {
    String patente, modelo; private Motor motor; private Conductor conductor;
    public Vehiculo(String p, String m, Motor mo, Conductor c){
        patente=p; modelo=m; motor=mo; conductor=c; c.setVehiculo(this);
    }
}

/* ========== 8. DocumentoFD -- FirmaDigital -- UsuarioFD (composición + agregación) ========== */
class UsuarioFD { String nombre, email; }
class FirmaDigital {
    String codigoHash, fecha; private UsuarioFD usuario;
    public FirmaDigital(String h, String f, UsuarioFD u){ codigoHash=h; fecha=f; usuario=u; }
}
class DocumentoFD {
    String titulo, contenido; private FirmaDigital firma;
    public DocumentoFD(String t, String c, FirmaDigital f){ titulo=t; contenido=c; firma=f; }
}

/* ========== 9. CitaMedica -- Paciente -- Profesional (asociaciones unidireccionales) ========== */
class Paciente { String nombre, obraSocial; }
class Profesional { String nombre, especialidad; }
class CitaMedica {
    String fecha, hora; private Paciente paciente; private Profesional profesional;
    public CitaMedica(String f, String h, Paciente p, Profesional pr){
        fecha=f; hora=h; paciente=p; profesional=pr;
    }
}

/* ========== 10. CuentaBancaria -- ClaveSeguridad -- TitularCB (composición + asoc. bidi) ========== */
class ClaveSeguridad { String codigo, ultimaModificacion; }
class TitularCB {
    String nombre, dni; private CuentaBancaria cuenta;
    public void setCuenta(CuentaBancaria c){ this.cuenta=c; }
}
class CuentaBancaria {
    String cbu; double saldo; private ClaveSeguridad clave; private TitularCB titular;
    public CuentaBancaria(String c, double s, ClaveSeguridad k, TitularCB t){
        cbu=c; saldo=s; clave=k; titular=t; t.setCuenta(this);
    }
}

/* ========== 11. Reproductor -- Cancion -- Artista (dependencia de uso) ========== */
class Artista { String nombre, genero; }
class Cancion {
    String titulo; private Artista artista;
    public Cancion(String t, Artista a){ titulo=t; artista=a; }
    @Override public String toString(){ return titulo; }
}
class Reproductor {
    public void reproducir(Cancion c){
        System.out.println("▶ Reproduciendo: " + c);
    }
}

/* ========== 12. Impuesto -- Contribuyente -- Calculadora (dependencia de uso) ========== */
class Contribuyente { String nombre, cuil; }
class Impuesto {
    double monto; private Contribuyente contribuyente;
    public Impuesto(double m, Contribuyente c){ monto=m; contribuyente=c; }
    @Override public String toString(){ return String.valueOf(monto); }
}
class Calculadora {
    public void calcular(Impuesto i){
        // uso temporal: no se guarda i como atributo
        System.out.println("Total a pagar: " + i);
    }
}

/* ========== 13. GeneradorQR -- UsuarioQR -- CodigoQR (dependencia de creación) ========== */
class UsuarioQR { String nombre, email; }
class CodigoQR { String valor; public CodigoQR(String v){ valor=v; } }
class GeneradorQR {
    public void generar(String valor, UsuarioQR u){
        CodigoQR qr = new CodigoQR(valor); // se crea y se usa
        System.out.println("QR generado para " + (u != null ? u.nombre : "usuario") + " -> " + valor);
    }
}

/* ========== 14. EditorVideo -- Proyecto -- Render (dependencia de creación) ========== */
class Proyecto { String nombre; int duracionMin; }
class Render { String formato; public Render(String f){ formato=f; } }
class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render r = new Render(formato); // crear y usar
        System.out.println("Exportando " + (proyecto != null ? proyecto.nombre : "proyecto") + " a " + formato);
    }
}

/* ===================== Demo opcional ===================== */
public class DemoTP5 {
    public static void main(String[] args) {
        // 1) Pasaporte
        Titular t = new Titular("Juan Perez", "4.123.456-7");
        Foto f = new Foto("foto.jpg", "jpg");
        Pasaporte p = new Pasaporte("UY123456", "2025-01-01", t, f);

        // 11) Reproductor (dependencia de uso)
        Artista a = new Artista(); a.nombre = "Queen"; a.genero = "Rock";
        Cancion c = new Cancion("Bohemian Rhapsody", a);
        new Reproductor().reproducir(c);

        // 12) Calculadora (dependencia de uso)
        Contribuyente contr = new Contribuyente(); contr.nombre = "ACME"; contr.cuil = "20-12345678-9";
        new Calculadora().calcular(new Impuesto(12345.67, contr));

        // 13) GeneradorQR (dependencia de creación)
        UsuarioQR uq = new UsuarioQR(); uq.nombre = "Gevont"; uq.email = "g@ejemplo.com";
        new GeneradorQR().generar("https://github.com/gevontutmazian8/uml-relaciones-tp5", uq);

        // 14) EditorVideo (dependencia de creación)
        Proyecto pr = new Proyecto(); pr.nombre = "Spot Voltage"; pr.duracionMin = 1;
        new EditorVideo().exportar("MP4", pr);
    }
}
