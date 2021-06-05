enum class FileType(val extension: String){
    CSV("csv"),
    EXCEL("xlsx")
}

/** Function with a Default Parameter **/
fun appendExt(
    name: String,
    fileType: FileType = FileType.CSV   //Default Parameter
): String = "$name.${fileType.extension}"

println(appendExt("table", fileType = FileType.EXCEL))
println(appendExt("table", fileType = FileType.CSV))

/*
Output:
table.xlsx
table.csv
 */