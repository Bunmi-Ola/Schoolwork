x:\AssortedFiles

Mkdir Docs

Mkdir Gifs

Mkdir Java

PAUSE

x:
cd "\AssortedFiles\Docs"
mkdir Word

mkdir Excel

mkdir Access


Pause
MOVE "X:\AssortedFiles\MiscFiles\MiscFiles\*.doc" "x:\AssortedFiles\Docs\Word"

MOVE "X:\AssortedFiles\MiscFiles\MiscFiles\*.xls" "x:\AssortedFiles\Docs\Excel"

MOVE "X:\AssortedFiles\MiscFiles\MiscFiles\*.mdb" "x:\AssortedFiles\Docs\Access"

MOVE "X:\AssortedFiles\MiscFiles\MiscFiles\*.GIF" "x:\AssortedFiles\Gifs"

MOVE "X:\AssortedFiles\MiscFiles\MiscFiles\*.java" "x:\AssortedFiles\Java"

Pause
Del "x:\AssortedFiles\MiscFiles.zip"



