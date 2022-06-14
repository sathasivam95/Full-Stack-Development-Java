package charSequence;

class ReverseString implements CharSequence{

    private String s;

    private int startEnd(int i){
        return s.length() - 1 -i;
    }

    public ReverseString(String s) {
        this.s = s;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= s.length()){
            throw new StringIndexOutOfBoundsException(index);
        }

        return charAt(startEnd(index));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0){
            throw new StringIndexOutOfBoundsException(start);
        }if (end > s.length()){
            throw new StringIndexOutOfBoundsException(end);
        }if (start > end){
            throw new StringIndexOutOfBoundsException(start-end);
        }

    }

    @Override
    public String toString() {
        return "ReverseString: " + s ;
    }

    public static void main(String[] args){

        String para = " Select one of the sentences from this book to use as the data.";




    }

}


