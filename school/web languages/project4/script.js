var d20 = document.getElementById("d20");
var d12 = document.getElementById("d12");
var d10 = document.getElementById("d10");
var d8 = document.getElementById("d8");
var d6 = document.getElementById("d6");
var d4 = document.getElementById("d4");

d20.addEventListener("click", (event) => {animate(d20)});
d12.addEventListener("click", (event) => {animate(d12)});
d10.addEventListener("click", (event) => {animate(d10)});
d8.addEventListener("click", (event) => {animate(d8)});
d6.addEventListener("click", (event) => {animate(d6)});
d4.addEventListener("click", (event) => {animate(d4)});

function animate(die) 
{
     die.classList.add("grow");
    setTimeout(() => die.classList.remove("grow"), 200);
    die.textContent = Math.floor(Math.random() * die.dataset.size) + 1;
}