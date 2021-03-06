NEWLINE = System.getProperty("line.separator")

begin = true

def record(columns, dataRow) {
    if (begin) {
        // header name
        columns.eachWithIndex { column, idx ->
            OUT.append("| ").append(column.name()).append(idx == columns.size() - 1 ? " |" : " ")
        }
        OUT.append(NEWLINE)
        
        begin = false
    }
    
    // values
    columns.eachWithIndex { column, idx ->
        def isNumber = dataRow.value(column).toString().isNumber()
        def stringValue = FORMATTER.format(dataRow, column)
        
        OUT.append("|").append(isNumber ? ">. " : "=. ").append(stringValue).append(idx == columns.size() - 1 ? " |" : " ")
    }
    OUT.append(NEWLINE)
}

ROWS.each { row -> record(COLUMNS, row) }
