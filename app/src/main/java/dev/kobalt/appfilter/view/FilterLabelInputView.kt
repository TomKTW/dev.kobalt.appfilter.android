package dev.kobalt.appfilter.view

import dev.kobalt.core.extension.dp
import dev.kobalt.core.view.LabelInputView
import dev.kobalt.core.view.LabelView
import dev.kobalt.core.view.StackView

open class FilterLabelInputView : StackView(Orientation.HORIZONTAL) {

    var id: String? = null

    private val label = LabelView()
    private val input = LabelInputView().apply {
        background = images.layersOf(
            images.rectangle(colors.grayDark, 0.dp),
            images.tapState(colors.black, 0.dp)
        )
    }

    var labelText: CharSequence
        get() = label.text
        set(value) {
            label.text = value
        }

    var inputValue: CharSequence
        get() = input.text
        set(value) {
            input.text = value
        }

    init {
        gravity = centerGravity
        add(label, width = wrapContent, height = wrapContent, margin = 8.dp)
        add(
            input,
            width = matchConstraint,
            height = wrapContent,
            weight = 1f,
            margin = 4.dp,
            padding = 4.dp
        )
    }

}