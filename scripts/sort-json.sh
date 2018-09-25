#!/bin/sh

# original:
# jq '.components.rows|=sort_by(.id)|.components.rows[].properties|=sort_by(.name)' file.json

jq '.javaLibraries|=sort_by(.id)|.javaLibraries[]' java-parsers.json

