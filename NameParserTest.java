class NameParser {
    public String parse(String[] names) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < names.length; i++){
            String[] parsedString = names[i].split(" ");
            if(i == 0){
                stringBuilder.append(parsedString[0]);
            }
            else {
                stringBuilder.append(", ").append(parsedString[0]);
            }
        }
        return String.valueOf(stringBuilder);
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}