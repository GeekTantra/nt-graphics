#~/bin/bash
for f in `ls -1 *-small.png`; do F=`echo ${f}|sed -e 's/-small\.png/-reflect/'`; 3Dreflection -o 100 -f 15 -a 40 $f $F.png; done;
for f in `ls -1 *-reflect.png`; do F=`echo ${f}|sed -e 's/\.png//'`; convert $f \( +clone +matte -threshold -1 \) +swap -composite  $F.jpg ; rm $f; done;
for f in `ls -1 *-reflect.jpg`; do F=`echo ${f}|sed -e 's/\-reflect.jpg//'`; convert $f -resize 250x  $F-250x282.jpg ; rm $f; done;

