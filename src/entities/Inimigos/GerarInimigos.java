package entities.Inimigos;

public class GerarInimigos {

    public static InimigoBase criarInimigoPorCenario(String cenario, int resultado) {
        String cenarioNormalizado = cenario.toLowerCase().trim();

        switch (cenarioNormalizado) {
            case "floresta":
                switch (resultado) {
                    case 0: return new InimigoBase("Urso Faminto", 45, 10, 30, 50, 15, 30);
                    case 1: return new InimigoBase("Goblin Maluco", 30, 7, 20, 35, 10, 25);
                    case 2: return new InimigoBase("Javali Furioso", 35, 8, 25, 40, 12, 28);
                }
                break;

            case "caverna":
                switch (resultado) {
                    case 0: return new InimigoBase("Morcego", 20, 5, 15, 25, 5, 15);
                    case 1: return new InimigoBase("Aranha Peludaça", 40, 9, 30, 45, 18, 35);
                    case 2: return new InimigoBase("Troll com Faquinha de Serra", 60, 12, 50, 75, 25, 50);
                }
                break;

            case "masmorra":
                switch (resultado) {
                    case 0: return new InimigoBase("Esqueleto Dançarino", 50, 11, 40, 60, 20, 40);
                    case 1: return new InimigoBase("Rato Gigante", 25, 6, 15, 30, 8, 20);
                    case 2: return new InimigoBase("Múmia Muito Louca", 65, 13, 55, 80, 30, 60);
                }
                break;

            case "castelo":
                switch (resultado) {
                    case 0: return new InimigoBase("Guarda", 70, 14, 60, 90, 35, 70);
                    case 1: return new InimigoBase("Mago", 60, 18, 80, 110, 50, 90);
                    case 2: return new InimigoBase("Fantasma do Rei", 100, 22, 120, 160, 80, 150);
                }
                break;
        }

        throw new IllegalArgumentException("Cenário ou evento inválido!");
        // opa
    }
}
