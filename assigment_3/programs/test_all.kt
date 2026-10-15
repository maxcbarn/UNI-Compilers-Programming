fun main ()
{
    var float : Float;
    var float1 : Float;
    var float2 : Float;
    var A_aa_a : Float;
    var A_9s123_B : Float;
    var boolean1 : Boolean;
    var boolean2 : Boolean;
    var void: Void;
    float = 9;
    float = 9.0;
    float = 9E2;
    float = 9E+2;
    float = 9E-2;
    float = 9.3E2;
    float = 9.3E+2;
    float = 9.3E-2;
    float1 = 9;
    float2 = 2.4;
    boolean1 = true;
    boolean2 = false;
    boolean1 = ( boolean2 && boolean1 );
    boolean1 = ( boolean2 || boolean1 );
    boolean1 = ( boolean2 == boolean1 );
    boolean1 = ( float1 < float2 );
    boolean1 = ( float1 > float2 );
    boolean1 = ( float1 == float2 );
    float = ( float1 + float2 );
    float = ( float1 - float2 );
    float = ( float1 * float2 );
    float = ( float1 / float2 );
    float = readFloat();
    if ( boolean1 == true ) {
        while ( boolean2 == false ) {
            float = ( float1 + float2 );
        };
    };
    if ( float1 < float2 ) {
        while ( float1 < float2 ) {
            float = ( float1 + float2 );
        };
    };
    print float;
    return 1;
}

fun asd() : Float {
    boolean1 = true;
    boolean2 = false;
}