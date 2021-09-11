package SectionSeven;

public class APIResponseParser {

    /*
     * Parses the input text and returns a Book instance containing the parsed data.
     * 
     * @param response text to be parsed
     * 
     * @return Book instance containing parsed data
     */

    public static Book parse(String response) {
        Book book = new Book();
        String endRule = "<";

        // Array for preset startRules
        String[] startRuleArr = { "<title>", "<name>", "<original_publication_year type=\"integer\">",
                "<average_rating>", "<ratings_count type=\"integer\">", "<image_url>" };

        // Traverse startRuleArray and return appropriate date
        for (String k : startRuleArr) {
            switch (k) {
                case "<title>":
                    book.setTitle(parse(response, k, endRule));
                    break;

                case "<name>":
                    book.setAuthor(parse(response, k, endRule));
                    break;

                case "<original_publication_year type=\"integer\">":
                    book.setPublicationYear(Integer.parseInt(parse(response, k, endRule)));
                    break;

                case "<average_rating>":
                    book.setAverageRating(Double.parseDouble((parse(response, k, endRule))));
                    break;

                case "<ratings_count type=\"integer\">":
                    book.setRatingsCount(Integer.parseInt(parse(response, k, endRule)));
                    break;

                case "<image_url>":
                    book.setImageUrl(parse(response, k, endRule));
                    break;

                default:
                    System.out.println("Error has occurred");
                    break;
            }
        }

        // Your code
        return book;
    }

    // write overloaded parse method with the 3 parameters response, startRule,
    // endRule

    private static String parse(String response, String startRule, String endRule) {
        String[] temp = response.split(endRule + "/"); // delimit string and split it into different lines
        String returnStr = " ";
        for (String k : temp) {
            if (k.contains(startRule)) { // check if delimited string contains startrule
                // extract end value of string and get rid of any commas so that numbers are
                // accessible as well
                returnStr = (k.substring(k.lastIndexOf('>') + 1, k.length()).replaceAll(",", ""));
                break;
            }
        }
        return returnStr; // return sanitized string
    }

    public static void main(String[] args) {
        String response = "<work>" + "<id type=\"integer\">2361393</id>"
                + "<books_count type=\"integer\">813</books_count>"
                + "<ratings_count type=\"integer\">1,16,315</ratings_count>"
                + "<text_reviews_count type=\"integer\">3439</text_reviews_count>"
                + "<original_publication_year type=\"integer\">1854</original_publication_year>"
                + "<original_publication_month type=\"integer\" nil=\"true\"/>"
                + "<original_publication_day type=\"integer\" nil=\"true\"/>" + "<average_rating>3.79</average_rating>"
                + "<best_book type=\"Book\">" + "<id type=\"integer\">16902</id>" + "<title>Walden</title>" + "<author>"
                + "<id type=\"integer\">10264</id>" + "<name>Henry David Thoreau</name>" + "</author>" + "<image_url>"
                + "http://images.gr-assets.com/books/1465675526m/16902.jpg" + "</image_url>" + "<small_image_url>"
                + "http://images.gr-assets.com/books/1465675526s/16902.jpg" + "</small_image_url>" + "</best_book>"
                + "</work>";

        System.out.println(APIResponseParser.parse(response).getPublicationYear());

    }
}