window.onload = function() {

    let suma = trigubaSuma(3, 5);

    console.log(suma);

    console.log(trigubaSuma(-2, 11));

    let sk1 = 50;
    let sk2 = 20;

    console.log(trigubaSuma(sk1, sk2))
}   

function trigubaSuma(a, b) {
    return 3 * (a + b);
}