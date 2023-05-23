window.onload = function () {

    let pastraipa1 = document.getElementById(`pastraipa1`);
    let pastraipa2 = document.getElementById(`pastraipa2`);
    let pastraipa3 = document.getElementById(`pastraipa3`);
    console.log(pastraipa1);
    console.log(pastraipa2);
    console.log(pastraipa3);

    pastraipa1.innerHTML = "Šiandien yra trečiadienis";
    pastraipa1.style.color = "blue";
    pastraipa2.style.border = "1px, solid, black";
    pastraipa2.style.padding = "0.5em";
    pastraipa3.style.backgroundColor = "bisque";
    pastraipa3.style.width = "50%";

    alert(pastraipa1.innerHTML);
    pastraipa3.innerHTML = `${pastraipa1.innerHTML} ${pastraipa2.innerHTML}`

    console.log(pastraipa3);

}