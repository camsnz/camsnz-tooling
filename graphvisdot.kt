fun printGraphVisDot() : String {
    StringBuilder sb = StringBuilder()
    val walkedIds = HashSet<String>()
    printGraphVisDotProductStep(primaryProduct, sb, walkedIds)
}

fun printGraphVisDotProductStep(product: Product, sb: StringBuilder, walkedIds: Set<String>) {
    if(walkedIds.contains(product.id)) {
        return
    }
    walkedIds.put(product.id)
    product.getCharges().forEach {
        sb.append("${product.id} -> ${it.id} [color=blue]")
        printGraphVisDotChargeStep(it, sb)
    }
}

fun printGraphVisDotChargeStep(charge: Charge, sb: StringBuilder, walkedIds: Set<String>) {
    if(walkedIds.contains(charge.id)) {
        return
    }
    walkedIds.put(charge.id)
    charge.getProducts().forEach {
        sb.append("${charge.id} -> ${it.id} [color=black]")
        printGraphVisDotProductStep(it, sb)
    }
}
