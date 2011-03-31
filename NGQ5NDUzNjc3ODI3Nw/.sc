for f in `ls -1 *.png`; do F=`echo ${f}|sed -e 's/\.png//'`; convert $f \( +clone +matte -threshold -1 \) +swap -composite  $F.jpg ; done;

