package src

SEPARATOR = ", "
QUOTE     = "\'"
NEWLINE   = System.getProperty("line.separator")

def record(columns, dataRow) {
    OUT.append("    {")
    
    columns.eachWithIndex { column, idx ->
        def skipQuote = dataRow.value(column).toString().isNumber() || dataRow.value(column) == null
        def stringValue = FORMATTER.format(dataRow, column)
        
        OUT.append(idx == 0 ? "" : "     ")
                .append(QUOTE).append(column.name()).append(QUOTE)
                .append(" : ")
                .append(skipQuote ? "": QUOTE).append(stringValue).append(skipQuote ? "": QUOTE)
                .append(idx != columns.size() - 1 ? SEPARATOR + NEWLINE : "")
    }
    
    OUT.append(NEWLINE).append("    },").append(NEWLINE)
}


OUT.append("[").append(NEWLINE)

ROWS.each { row -> record(COLUMNS, row) }

OUT.append("]")
