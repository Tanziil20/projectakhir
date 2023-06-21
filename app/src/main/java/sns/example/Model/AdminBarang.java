package sns.example.Model;

public class AdminBarang {

        private String id;
        private String imageResource;

        private String namaBarang;

        private String hargaBarang;

        public AdminBarang(String id, String namaBarang, String hargaBarang, String gambar) {
            this.id = id;
            this.imageResource = gambar;
            this.namaBarang = namaBarang;
            this.hargaBarang = hargaBarang;
        }

        public String getId() { return id; }

        public String getImageResource() {
            return imageResource;
        }

        public String getNamaBarang() {
            return namaBarang;
        }

        public String getHargaBarang() {
            return hargaBarang;
        }
    }

