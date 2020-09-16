package Encapsulamento;

public class ControleRemoto implements Controlador {
        // ATRIBUTOS
        private int volume;
        private boolean ligado;
        private boolean tocando;

        //METODO CONSTRUTOR
        public ControleRemoto() {
            this.setVolume(50);
            this.setLigado(false);
            this.setTocando(false);
        }

        private void setVolume(int volume) {
            this.volume = volume;
        }

        private int getVolume() {
            return this.volume;
        }

        private void setLigado(boolean ligado) {
            this.ligado = ligado;
        }

        private boolean getLigado() {
            return this.ligado;
        }

        private void setTocando(boolean tocando) {
            this.tocando = tocando;
        }

        private boolean getTocando() {
            return this.tocando;
        }
        //METODOS ABSTRATOS

        @Override
        public void ligar() {
            this.setLigado(true);
        }

        @Override
        public void desligar() {
            this.setLigado(false);
        }

        @Override
        public void abrirMenu() {
            System.out.println("=============== M E N U ================");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");

            }
            System.out.println("");
        }

        @Override
        public void fecharMenu() {
            System.out.println("Fechando menu...");
        }

        @Override
        public void maisVolume() {
            if (getLigado() == true) {
                setVolume(this.getVolume() + 5);
            } else {
                System.out.println("Ligue a TV antes");
            }
        }

        @Override
        public void menosVolume() {
            if (this.getLigado() == true) {
                this.setVolume(this.getVolume() - 5);
            } else {
                System.out.println("Ligue a TV antes");
            }
        }

        @Override
        public void ligarMudo() {
            if (this.getLigado() && this.getVolume() > 0) {
                this.setVolume(0);
            }
        }

        @Override
        public void desligarMudo() {
            if (this.getLigado() && this.getVolume() == 0) {
                this.setVolume(50);
            }
        }

        @Override
        public void play() {
            if (this.getLigado() && !(getTocando())) {
                this.setTocando(true);
            } else {
                System.out.println("Não consegui reproduzir");
            }
        }

        @Override
        public void pause() {
            if (this.getLigado() && this.getTocando()) {
                this.setTocando(false);
            } else {
                System.out.println("Não consegui pausar");
            }
        }
    }


