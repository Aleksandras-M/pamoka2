window.onload = function () {

    let x = 25;
    console.log(pirmaLygtis(x));

    atskirimas();

    let c = prompt("įveskite pirmą skaičių");
    let d = prompt("įveskite antrą skaičių");
    console.log(antraLygtis(c, d));

    atskirimas();

    let zodis = "pirmadienis"
    console.log(trysZodziai("zodis"));

    atskirimas();

    let f = 25;
    let g = 37;
    console.log(sudetiTeksta(f, g));

    atskirimas();
    let h = 5;
    console.log(apkeistiZenkla(h));
    let i = -144
    console.log(apkeistiZenkla(i));

}

function pirmaLygtis(a) {
    return (2 * a) - 10;
}

function antraLygtis(a, b) {
    return a * b / a + b;
}

function atskirimas() {
    console.log("--------------");
}

function trysZodziai(zodis) {
    return (zodis + " " + zodis + " " + zodis);
}

function sudetiTeksta(a, b) {
    return a + "" + b;
}

function apkeistiZenkla (x) {
    return x * -1;
}