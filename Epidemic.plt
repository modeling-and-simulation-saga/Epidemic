set terminal pdfcairo enhanced color size 29cm,20cm font "Times-New-Roman" fontscale 1.2
set xlabel "{/:Italic t}"
set title "Epidemic Model"
#set yrange [0:0.15]
set xrange [0:150]
set xtic 10
set output "epidemic.pdf"
#set ytic 0.01
set xtic 50
#set key right bottom
plot "EpidemicDynamics.txt" using 1:2 with line lw 5 title "I"
#"EpidemicDynamics.txt" using 1:3 with line lw 5 title "S"
