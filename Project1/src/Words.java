
public class Words {

	public static void main(String[] args) {
String st = "Welcome to core Java";

////boolean
boolean empty = st.isEmpty();
System.out.println(empty);

//length

int length = st.length();
System.out.println(length);


///to find particular position of character
char charAt = st.charAt(5);
System.out.println(charAt);

//uppercase

String upperCase = st.toUpperCase();
System.out.println(upperCase);



//lowercase

String lowerCase = st.toLowerCase();
System.out.println(lowerCase);


///indexof

int indexOf = st.indexOf('t');
System.out.println(indexOf);


//lastindexof

int lastindexOf=st.lastIndexOf('a');
System.out.println(lastindexOf);


//equal it is case sensitive

boolean equals = st.equals("Welcome to core Java");
System.out.println(equals);


//to accept with case

boolean equalsIgnoreCase = st.equalsIgnoreCase ("welcome to core java");
System.out.println(equalsIgnoreCase);


//substring

String substring =  st.substring(6);
System.out.println(substring);


String substring1 = st.substring(6, 12);
System.out.println(substring1);


//it will replace the particular word
String replace = st.replace("Welcome","hi");
System.out.println(replace);

///////it compare the string last word and gives true or false
boolean endswith = st.endsWith("o");
System.out.println(endswith);


///compare to

String st1 = "ABC";
int compareTo = st1.compareTo("ABc");
System.out.println(compareTo);


int compareTo3 = st1.compareTo("ABCDEF");
System.out.println(compareTo3);

int compareTo1 = st1.compareTo("ABC");
System.out.println(compareTo1);

String st2 = "ABCDEF";
int compareTo2 = st2.compareTo("ABC");
System.out.println(compareTo2);

int compareTo4 = st2.compareTo("ABD");
System.out.println(compareTo4);


//////Trim it removes space in first and last


String s = "Hello Arthi"; 
String trim = s.trim();
System.out.println(trim);



////Contains

boolean contains = s.contains("Hello");
System.out.println(contains);

boolean contains1 = s.contains(";");
System.out.println(contains1);


//////Concatenation


String A ="Hello"+"World";
String B ="Arthi";
String concat = A.concat(B);
System.out.println(concat);

///////Isempty if empty it give give true

String D = "Welcome to Java";
boolean empty2 = D.isEmpty();
System.out.println(empty2);

String D1 ="";
boolean empty3 = D1.isEmpty();
System.out.println(empty3);


String D2="   ";
boolean empty4 = D2.isEmpty();
System.out.println(empty4);

String D3 =null;   ///////exception error
boolean empty5 = D3.isEmpty();
System.out.println(empty5);









	}


	}


