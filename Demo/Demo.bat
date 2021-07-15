ECHO "Create a network drive"
net use x: \\bisiisdev\FIT01\Demo

ECHO "Create Directories under network drive"
mkdir "x:\Holder Folder"

x:
cd "Holder Folder"
md Images

PAUSE
ECHO "Move images to images folder"
MOVE "X:\*.png" "x:Holder Folder\Images
MOVE "X:\*.jpg" "x:Holder Folder\Images

PAUSE
ECHO "Move Test Files to Holder Folder
MOVE "X:\*.txt" "x:\Holder Folder"
pause