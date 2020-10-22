set terminal png  fontscale 1.2
set xlabel "{/:Italic t}"
set title "Epidemic Model"
set xrange [0:100]
set output "epidemic.png"
set ytic 0.02
set xtic 20
plot "EpidemicDynamics.txt" using 1:2 with line lw 5 title "I"
