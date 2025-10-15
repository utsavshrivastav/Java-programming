const cells = document.querySelectorAll(".cell");
const turnInfo = document.getElementById("turnInfo");
const resetBtn = document.getElementById("resetBtn");

let board = ["", "", "", "", "", "", "", "", ""];
let currentPlayer = "X";
let isGameOver = false;

const winningCombination = [
    [0,1,2],[3,4,5],[6,7,8], // Rows
    [0,3,6],[1,4,7],[2,5,8], // Columns
    [0,4,8],[2,4,6]          // Diagonals
];

function checkWinner() {
    for(let combo of winningCombination){
        const [a, b, c] = combo;
        if(board[a] && board[a] === board[b] && board[a] === board[c]){
            isGameOver = true;
            turnInfo.textContent = `Player ${currentPlayer} Wins! 🎉`;
            return;
        }
    }

    if(!board.includes("")){
        isGameOver = true;
        turnInfo.textContent = "It's a Draw! 🤝";
    }
}

cells.forEach(cell => {
    cell.addEventListener("click", () => {
        const index = cell.getAttribute("data-index");

        if(board[index] === "" && !isGameOver){
            board[index] = currentPlayer;
            cell.textContent = currentPlayer;
            checkWinner();

            if(!isGameOver){
                currentPlayer = currentPlayer === "X" ? "O" : "X";
                turnInfo.textContent = `Player ${currentPlayer}'s Turn`;
            }
        }
    });
});

resetBtn.addEventListener("click", () => {
    board = ["", "", "", "", "", "", "", "", ""];
    cells.forEach(cell => cell.textContent = "");
    currentPlayer = "X";
    isGameOver = false;
    turnInfo.textContent = "Player X's Turn";
});
