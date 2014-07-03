public class Dss {
    public String treat(DssInput dssInput) {
        StringBuilder sb = new StringBuilder();

        if (dssInput.getAmount() < dssInput.drink.getPrice()) {
            return "M:" + String.valueOf(dssInput.drink.getPrice() - dssInput.getAmount());
        }

        switch (dssInput.drink) {
            case COFFEE:
                sb.append("C");
                break;
            case TEA:
                sb.append("T");
                break;
            case CHOCOLATE:
                sb.append("H");
                break;
            case ORANGE_JUICE:
                sb.append("O");
                break;
        }

        if (dssInput.isHot()) {
            sb.append("h");
        }

        sb.append(":");

        switch (dssInput.numberOfSugar) {
            case 0:
                break;
            case 1:
            case 2:
                sb.append(dssInput.numberOfSugar);
                break;

        }

        sb.append(":");


        if (dssInput.numberOfSugar > 0) {
            sb.append("0");
        }

        return sb.toString();
    }
}
